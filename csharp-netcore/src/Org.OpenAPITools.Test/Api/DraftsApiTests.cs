/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;
// uncomment below to import models
//using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing DraftsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class DraftsApiTests : IDisposable
    {
        private DraftsApi instance;

        public DraftsApiTests()
        {
            instance = new DraftsApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of DraftsApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' DraftsApi
            //Assert.IsType<DraftsApi>(instance);
        }

        /// <summary>
        /// Test CreateDrafts
        /// </summary>
        [Fact]
        public void CreateDraftsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //List<Draft> drafts = null;
            //var response = instance.CreateDrafts(drafts);
            //Assert.IsType<JsonSuccess>(response);
        }

        /// <summary>
        /// Test DeleteDraft
        /// </summary>
        [Fact]
        public void DeleteDraftTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int draftId = null;
            //var response = instance.DeleteDraft(draftId);
            //Assert.IsType<JsonSuccess>(response);
        }

        /// <summary>
        /// Test EditDraft
        /// </summary>
        [Fact]
        public void EditDraftTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int draftId = null;
            //Draft draft = null;
            //var response = instance.EditDraft(draftId, draft);
            //Assert.IsType<JsonSuccess>(response);
        }

        /// <summary>
        /// Test GetDrafts
        /// </summary>
        [Fact]
        public void GetDraftsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.GetDrafts();
            //Assert.IsType<JsonSuccess>(response);
        }
    }
}