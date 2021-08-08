import connexion
import six

from app.openapi_server.models.inline_response200 import InlineResponse200  # noqa: E501
from openapi_server import util


def zulip_outgoing_webhooks():  # noqa: E501
    """Outgoing webhooks

    Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip.  # noqa: E501


    :rtype: InlineResponse200
    """
    return 'do some magic!'
